package com.lewokapps.firebaseonhomepage;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class Dbqueries {
    private static List<KonoModel> konoModelList = new ArrayList<>();

    public static FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();

    public static void loadRecycleData(final RecyclerView konoRecyclerViewDbQueries) {

        firebaseFirestore.collection("CATEGORIES").document("HOME").collection("TOP_DEALS").document("h7TO9qes02Rc1xmV08MY").get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {

                if (task.isSuccessful()) {

                    final DocumentSnapshot documentSnapshot = task.getResult();

                    konoModelList.add(new KonoModel("item"));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel((String) documentSnapshot.get("darkness")));
                    konoModelList.add(new KonoModel("item"));
                    konoModelList.add(new KonoModel("item"));


                    KonoAdapter konoAdapter = new KonoAdapter(konoModelList);
                    konoRecyclerViewDbQueries.setAdapter(konoAdapter);
                    konoAdapter.notifyDataSetChanged();


                }
            }


        });
    }
}