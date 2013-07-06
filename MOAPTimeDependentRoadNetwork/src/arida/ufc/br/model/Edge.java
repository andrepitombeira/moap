package arida.ufc.br.model;

public class Edge {
	
	private final Vertice source;
	
	private final Vertice destiny;
	
	private String label;
	
	public Edge(Vertice source, Vertice destiny) {
		this.source = source;
		this.destiny = destiny;		
	}

	public Vertice getSource() {
		return source;
	}

	public Vertice getDestiny() {
		return destiny;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public boolean equals(Edge edge) {
		if(edge.getSource().equals(this.getSource()) && edge.getDestiny().equals(this.getDestiny())) {
			return true;
		}
		return false;
	}
}
