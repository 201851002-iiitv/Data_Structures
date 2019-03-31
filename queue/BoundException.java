class BoundException extends Exception
{

	void printError()
	{
	printStackTrace();
	
	System.err.println("Out of bounds!");
	}
}

