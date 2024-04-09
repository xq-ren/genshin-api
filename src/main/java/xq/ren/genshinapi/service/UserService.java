package xq.ren.genshinapi.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xq.ren.genshinapi.model.ElementData;
import xq.ren.genshinapi.model.UserData;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class UserService {

    @Autowired
    Firestore firestore;
    private static final String COLLECTION_NAME = "GenshinImpact";
    private static final String DOCUMENT_NAME = "Server";
    private static final String SERVER_REGION = "EU";



    public Optional<UserData> getUser(String username) throws InterruptedException, ExecutionException {
        DocumentReference user = firestore.collection(COLLECTION_NAME).document(DOCUMENT_NAME).collection(SERVER_REGION).document(username);

        // Fetch a product by UID
        ApiFuture<DocumentSnapshot> documentSnapshot = user.get();
        UserData userData = documentSnapshot.get().toObject(UserData.class);

        return Optional.ofNullable(userData);
    }

    public List<UserData> getAllUsers() throws InterruptedException, ExecutionException {
        CollectionReference user = firestore.collection(SERVER_REGION);

        // Fetch all products
        ApiFuture<QuerySnapshot> querySnapshot = user.get();
        List<UserData> userList = new ArrayList<>();
        for (QueryDocumentSnapshot document : querySnapshot.get()) {
            userList.add(document.toObject(UserData.class));
        }

        return userList;
    }

    public List<ElementData> getAllElements() throws InterruptedException, ExecutionException {
        CollectionReference element = firestore.collection(COLLECTION_NAME);

        // Fetch all products
        ApiFuture<QuerySnapshot> querySnapshot = element.get();
        List<ElementData> elementList = new ArrayList<>();
        for (QueryDocumentSnapshot document : querySnapshot.get()) {
            elementList.add(document.toObject(ElementData.class));
        }

        return elementList;
    }
}
