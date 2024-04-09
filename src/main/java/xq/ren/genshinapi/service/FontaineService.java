package xq.ren.genshinapi.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xq.ren.genshinapi.model.FontaineData;
import xq.ren.genshinapi.model.UserData;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class FontaineService {
    @Autowired
    Firestore firestore;
    private static final String COLLECTION_NAME = "GenshinImpact/Region/Fontaine";

    public Optional<FontaineData> getFontaineCharacter(String name) throws InterruptedException, ExecutionException {
        DocumentReference character = firestore.collection(COLLECTION_NAME).document(name);

        // Fetch a character
        ApiFuture<DocumentSnapshot> documentSnapshot = character.get();
        FontaineData fontaineData = documentSnapshot.get().toObject(FontaineData.class);

        return Optional.ofNullable(fontaineData);
    }

    public List<FontaineData> getAllFontaineCharacters() throws InterruptedException, ExecutionException {
        CollectionReference characters = firestore.collection(COLLECTION_NAME);

        // Fetch all characters
        ApiFuture<QuerySnapshot> querySnapshot = characters.get();
        List<FontaineData> characterList = new ArrayList<>();
        for (QueryDocumentSnapshot document : querySnapshot.get()) {
            characterList.add(document.toObject(FontaineData.class));
        }

        return characterList;
    }

}
