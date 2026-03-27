package com.example.cadastrousuario;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

//classe adpter : gerencia a criaçao eo preenchimento dos itens na RecycleView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    //atributo privado que armazena a referencia dos dados que serao exibidos
    private List<String> listaUsuario;

    //Construtor que permite que a MainActivity "entregue" a lista de dados para este Adapter

    public UserAdapter(List<String>lista){
        this.listaUsuario = lista;
    }
    //Metodo 1: Cria "do zero" o visual de uma linha da lista(+ViewHolder)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int Viewtype){
        //LayouInflater trasforma o arquivo em XML em um obejeto View Java
        // aqui usamos um layout padrao do android (simples_list_item_1) para facilitar
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,parent, false);
        //retorna um nova instancia da nossa classe interna Viewholder com View criada
        return new ViewHolder(view);
    }

    //Metodo 2: Vincula os dados de um objeto de lista a uma linha especifica da tela
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        //Recupera os dados da lista de acordo com a posição que o android esta desenhado agora
        String nome = listaUsuario.get(position);
        //define o texto no componente visual que esta guardado dentro de 'holder'
        holder.tvNome.setText(nome);
    }

    //Metodo 3: Informa para o android quantos itens a lista possuei ao todo
    @Override
    public int getItemCount(){
        //se a lista existir,retirna o tamanho, se nao retorna zero
        return listaUsuario !=null? listaUsuario.size():
                0;

    }

    //Classe interna ViewHolder: Servir para "segurar" as referencias dos componetes de cada linha
    //evitar chamadas respectivas ao findViewById,melhorando a  performance do RecyleView

    public class ViewHolder extends RecyclerView.ViewHolder{
      // Referencia para TextView da linha
      TextView tvNome;

      public ViewHolder(@NonNull View intemView){
          super(intemView);
          //Faz o mapeamento do ID do layout para o objeto java
          //android.R.id.text1 e o ID padrao do layout 'simples_list_item_1"
          tvNome = itemView.findViewById(android.R.id.text1);
      }
    }

}
