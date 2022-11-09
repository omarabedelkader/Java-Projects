/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListQuiz;

/**
 *
 * @author Omar
 */
public class MyArrayList <Anytype> implements List <Anytype>
{
    private Anytype [ ] theArray;    
    private int theSize;
    private static final int INIT_CAPACITY = 10;
    
    public MyArrayList( )
    {
        Clear( );
    }
    
    /*
     * Construct an empty ArrayList
     * by setting its size by the user
     */
    public MyArrayList(int arraySize)
    {
    	theArray = (Anytype[]) new Object[ arraySize ];
    	this.theSize = 0;
    }
    
    /*
     * Change the size of this collection to zero
     */
    public void Clear( )
    {
        theSize = 0;
        theArray = (Anytype[]) new Object[ INIT_CAPACITY ];
    }
    
    /*
     * Returns the number of items in this collection.
     */
    public int Size( )
    {
        return theSize;
    }
    
    /*
     * Returns the item at a specific position
     */
    public Anytype getElement( int idx )
    {
        if( idx < 0 || idx >= Size( ) )
            throw new ArrayIndexOutOfBoundsException( "Index " + idx + "; size " + Size( ) );
    
        return theArray[ idx ];    
    }
        
    /*
     * Changes the item at a specific position
     */
    public void setElement( int idx, Anytype newVal )
    {
        if( idx < 0 || idx >= Size( ) )
            throw new ArrayIndexOutOfBoundsException( "Index " + idx + "; size " + Size( ) );
      
        theArray[ idx ] = newVal;
    }
    
    /*
     * Adds an item to this collection, at the end
     */
    public void Add( Anytype item )
    {
        if( theArray.length == Size( ) )
        	ExpandArray();
        
        theArray[ theSize++ ] = item; 
    }

    /*
     * Adds an item to this collection, at a specific location, 
     */
    public void AddTo( Anytype item , int index)
    {
       	if (index < 1 )
    		index = 0;
    	else if (index > theSize)
    		index = theSize;
    	
    	if (index==theSize)
    		Add(item);
    	else
    	{
            if( theArray.length == Size( ) )
            	ExpandArray();
            
    		for(int i=theSize; i>index; i--)
    			theArray[i]=theArray[i-1];
    	
    		theArray[index]= item;
    		theSize++;
    	}
    }
    
    /*
     * Double the array number of elements by:
     * 1- renaming the current array to be old array 
     * 2- creating a new array of double size
     *    and set the new array to be the current array 
     * 3- copying elements to the new array
     */
    private void ExpandArray()
    {
       	Anytype [ ] old = theArray;
        theArray = (Anytype[]) new Object[ theArray.length * 2];
      
        for( int i = 0; i < Size( ); i++ )
        	theArray[ i ] = old[ i ];
    }

    /*
     * Removes an item from this collection
     */
    public Anytype Remove( )
    {
    	if (Size() < 1)
    		throw new RuntimeException();
    		
        Anytype removedItem = theArray[ theSize-1 ];
        
        theSize--;    
        
        return removedItem;
    }
    
    /*
     * Removes an item from this collection
     */
    public Anytype RemoveAt( int idx )
    {
        Anytype arr = new Anytype[theArray.length];
        
       
      for (int i=0; i<idx; i++){
          
          arr[i] = theArray[i];
          
      }
      for(int i = idx+1; i <theArray.length; i++ ){
          
        arr[i-1] = theArray[i];
          
      } 
      
      return arr;
    }
    
    /*
     * Print all the existing values in the array
     */
    public void Print()
    {
    	System.out.print("Index  : \t");
    	for(int i=0; i<theSize; i++)
    		System.out.print((i) + "\t");
    	
    	System.out.print("\nElement:\t");
    	
    	for(int i=0; i<theSize; i++)
    		System.out.print(theArray[i] + "\t");
    	
    	System.out.println("\n");
    }
    
    /*
     * Returns true if given value is found somewhere in this list
     */
	public boolean Contains(Anytype key)
	{
		for(int i=0; i<theSize; i++)
			if (theArray[i]==key)
				return true;
		
		return false;
	}
	
	/*
     * Returns the index of a given value if found somewhere in this list
     */
	public int IndexOf(Anytype key)
	{
        
        for (int i=0; i<theArray.length; i++){
            if (theArray[i] == key)
                return i;
            
        }
        return -1;
    }
	
}



