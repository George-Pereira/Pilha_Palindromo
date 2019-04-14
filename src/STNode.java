public class STNode 
{
	private char element;
	private STNode next;
	public STNode(char c, STNode n)
	{
		element = c;
		next = n;
	}
	public STNode(char element) 
	{
		this(element, null);
	}
	public char getElemento()
	{ 
		return element; 
	}
	public STNode getNext()
	{ 
		return next; 
	}
	public void setElemento(char newElem)
	{ 
		element = newElem; 
	}
	public void setNext(STNode newNext)
	{
		next = newNext; 
	}
}
