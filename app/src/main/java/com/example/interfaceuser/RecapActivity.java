package com.example.interfaceuser;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RecapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recap);

        TextView tvRecap = findViewById(R.id.tvRecap);

        // Récupération des données envoyées
        String nom = getIntent().getStringExtra("NOM");
        String prenom = getIntent().getStringExtra("PRENOM");
        String email = getIntent().getStringExtra("EMAIL");
        String phone = getIntent().getStringExtra("PHONE");
        String adresse = getIntent().getStringExtra("ADRESSE");
        String ville = getIntent().getStringExtra("VILLE");

        // Création du récapitulatif
        String recapText = "📌 Récapitulatif de l'inscription :\n\n" +
                "👤 Nom : " + nom + "\n" +
                "👤 Prénom : " + prenom + "\n" +
                "📧 Email : " + email + "\n" +
                "📞 Téléphone : " + phone + "\n" +
                "🏠 Adresse : " + adresse + "\n" +
                "🌍 Ville : " + ville;

        tvRecap.setText(recapText);
    }
}

