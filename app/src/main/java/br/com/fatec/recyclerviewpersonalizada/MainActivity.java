package br.com.fatec.recyclerviewpersonalizada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<FilmeDto> filmes = new ArrayList<>();
    private RecyclerView recyclerViewFilme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewFilme = findViewById(R.id.recyclerViewFilme);

        carregaFilmes();
        MeuAdapter adapter = new MeuAdapter(filmes);

        recyclerViewFilme.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerViewFilme.setAdapter(adapter);

        recyclerViewFilme.addOnItemTouchListener(new RecyclerItemClickListener(MainActivity.this, recyclerViewFilme,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        String nome = filmes.get(position).getTitulo();
                        Toast.makeText(MainActivity.this, "Nome: " + nome, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        String genero = filmes.get(position).getGenero();
                        Toast.makeText(MainActivity.this, "Gênero: " + genero, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                }));
    }

    private void carregaFilmes() {
        FilmeDto filme1 = new FilmeDto("Um sonho de Liberdade", "1994", "Drama", "9.2", R.drawable.sonho);
        FilmeDto filme2 = new FilmeDto("O poderoso chefão", "1972", "Drama", "9.1", R.drawable.chefao1);
        FilmeDto filme3 = new FilmeDto("O poderoso chefão 2", "1974", "Drama", "9.0", R.drawable.chefao2);
        FilmeDto filme4 = new FilmeDto("Cavaleiro das trevas", "2008", "Aventura", "9.0", R.drawable.batman);
        FilmeDto filme5 = new FilmeDto("12 homens e uma sentença", "1978", "Drama", "8.9", R.drawable.sentenca);
        FilmeDto filme6 = new FilmeDto("A lista de Schindler", "1993", "Drama", "8.9", R.drawable.lista);

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        filmes.add(filme4);
        filmes.add(filme5);
        filmes.add(filme6);
    }
}