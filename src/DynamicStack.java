
public class DynamicStack 
{
	private STNode topo;
	private int tamanho;
	public DynamicStack() 
	{
		this.topo = null;
		this.tamanho = 0;
	}
	public boolean isEmpty() 
	{
		return topo == null;
	}
	public int getTamanho() 
	{
		return tamanho;
	}
	public char mostraTopo() throws EmptyStackException 
	{
		if(isEmpty()) 
		{
			throw new EmptyStackException();
		}
		return topo.getElemento();
	}
	public void push(char elemento) 
	{
		STNode disco = new STNode(elemento, topo);
		topo = disco;
		tamanho++;
	}
	public char pop() throws EmptyStackException 
	{
		if(isEmpty()) 
		{
			throw new EmptyStackException();
		}
		char popped = topo.getElemento();
		topo = topo.getNext();
		tamanho--;
		return popped;
	}
}
