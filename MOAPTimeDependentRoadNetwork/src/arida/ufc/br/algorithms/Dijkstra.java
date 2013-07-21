package arida.ufc.br.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import arida.ufc.br.model.Graph;
import arida.ufc.br.model.Vertice;

public class Dijkstra {
	
//    List<Vertice> menorCaminho = new ArrayList<Vertice>();
//    
//    Vertice verticeCaminho = new Vertice();
//    
//    Vertice atual = new Vertice();
//    
//    Vertice vizinho = new Vertice();
//    
//    List<Vertice> fronteira = new ArrayList<Vertice>();
//    
//    int verticesNaoVisitados;
//    
//    public List<Vertice> encontrarMenorCaminhoDijkstra(Graph grafo, Vertice v1, Vertice v2){
//            
//            verticesNaoVisitados = grafo.getVertices().size();
//            
//            atual = v1;
//            fronteira.add(atual);
//            menorCaminho.add(atual);
//            
//            for (int i=0;i< grafo.getVertices().size();i++){
////                    if (grafo.getVertices().get(i).getDescricao().equals(atual.getDescricao())){
////                            grafo.getVertices().get(i).setDistancia(0);
////                            
////                    } else{
////                            grafo.getVertices().get(i).setDistancia(9999);
////                            
////                    }
//            }
//            
//            while (verticesNaoVisitados != 0){
//                    atual = this.fronteira.get(0);
////                    for (int i=0; i<atual.getArestas().size();i++){
////                            
////                            vizinho = atual.getArestas().get(i).getDestino();                               
////                            if (!vizinho.verificarVisita()){
////                                    
////                                    vizinho.setPai(atual);
////                                    
////                                    if (vizinho.getDistancia() > (atual.getDistancia() + atual.getArestas().get(i).getPeso())){
////                                            
////                                            vizinho.setDistancia(atual.getDistancia() + atual.getArestas().get(i).getPeso());
////                                            
////                                            if (vizinho == v2){
////                                                    menorCaminho.clear();
////                                                    verticeCaminho = vizinho;
////                                                    menorCaminho.add(vizinho);
////                                                    while (verticeCaminho.getPai() != null){
////                                                    
////                                                            menorCaminho.add(verticeCaminho.getPai());
////                                                            verticeCaminho = verticeCaminho.getPai();
////                                                            
////                                                            
////                                                    }
////                                                    Collections.sort(menorCaminho);
////                                                    
////                                            }
////                                    }
////                                    this.fronteira.add(vizinho);
////                            }
////                            
////                    }
//                    //atual.visitar();
//                    verticesNaoVisitados--;
//                    this.fronteira.remove(atual);
//                    //Collections.sort(fronteira);
//            
//            }
//            return menorCaminho;
//    }


}
