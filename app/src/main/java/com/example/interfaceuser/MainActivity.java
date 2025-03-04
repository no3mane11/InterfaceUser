package com.example.interfaceuser;



import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupération des éléments de l'interface
        EditText etNom = findViewById(R.id.etNom);
        EditText etPrenom = findViewById(R.id.etPrenom);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPhone = findViewById(R.id.etPhone);
        EditText etAdresse = findViewById(R.id.etAdresse);
        EditText etVille = findViewById(R.id.etVille);
        Button btnEnvoyer = findViewById(R.id.btnEnvoyer);

        // Action du bouton "Envoyer"
        btnEnvoyer.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RecapActivity.class);
            intent.putExtra("NOM", etNom.getText().toString());
            intent.putExtra("PRENOM", etPrenom.getText().toString());
            intent.putExtra("EMAIL", etEmail.getText().toString());
            intent.putExtra("PHONE", etPhone.getText().toString());
            intent.putExtra("ADRESSE", etAdresse.getText().toString());
            intent.putExtra("VILLE", etVille.getText().toString());

            // Lancer l'activité du récapitulatif
            startActivity(intent);
        });
    }
}
