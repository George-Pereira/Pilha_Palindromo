import javax.swing.JOptionPane;
public class Main 
{
	public static void main(String[] args) 
	{
		boolean palindromo = false;
		int CTA;
		DynamicStack pilha = new DynamicStack();
		String caracteres = JOptionPane.showInputDialog("Insira os caracteres desejados:");
		char [] array = caracteres.toLowerCase().toCharArray();
		for(CTA = 0; CTA<array.length; CTA++) 
		{
			if(array[CTA] != ' ' && array[CTA] != '-' && array[CTA] != ',') 
			{
				pilha.push(array[CTA]);
			}
		}
		CTA = 0;
		while(!pilha.isEmpty())
		{
			try 
			{
				if(array[CTA] != ' ' && array[CTA] != '-' && array[CTA] != ',') 
				{
					if(array[CTA] == pilha.pop()) 
					{
						palindromo = true;
					}
					else 
					{
						palindromo = false;
						break;
					}
				}
			}
			catch (EmptyStackException e) 
			{
				e.printStackTrace();
			}
			CTA++;
		}
		if(palindromo) 
		{
			System.out.println("A sequencia é um Palindromo");
		}
		else 
		{
			System.out.println("A sequencia não é um Palindromo");
		}
	}
}
