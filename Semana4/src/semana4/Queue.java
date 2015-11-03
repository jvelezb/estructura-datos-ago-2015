
package semana4;

/**
 *
 * @author juanvelezballesteros
 */
 
    public final class Queue
    {
        private Object[ ] theArray;
        private int        currentSize;
        private int        front;
        private int        back;

        static final int DEFAULT_CAPACITY = 10;
        
    

        /**
         * Construct the queue.
         */
        public Queue( int capacity )
        {
            theArray = new Object[capacity];
            makeEmpty( );
        }
        
            
        /**
         * Construct the queue.
         */
        public Queue( )
        {
            this( DEFAULT_CAPACITY );
        }

        /**
         * Test if the queue is logically empty.
         * @return true if empty, false otherwise.
         */
        public boolean isEmpty( )
        {
            return currentSize == 0;
        }

        /**
         * Test if the queue is logically full.
         * @return true if full, false otherwise.
         */
        public boolean isFull( )
        {
            return currentSize == theArray.length;
        }

        /**
         * Make the queue logically empty.
         */
        public void makeEmpty( )
        {
            currentSize = 0;
            front = 0;
            back = -1;
        }

        
        public Object getFront( )
        {
            if( isEmpty( ) )
                return null;
            return this.theArray[ front ];
        }

        
        public Object dequeue( )
        {
            if( isEmpty( ) )
                return null;
            currentSize--;

            Object frontItem = theArray[ front ];
            theArray[ front ] = null;
            front = increment( front );
            return frontItem;
        }

      
        public void enqueue( Object x ) throws Exception
        {
            if( isFull( ) )
                throw new Exception( );
            back = increment( back );
            theArray[ back ] = x;
            currentSize++;
        }

        
        private int increment( int x )
        {
            if( ++x == theArray.length )
                x = 0;
            return x;
        }

    


        public static void main( String [ ] args )
        {
            Queue q = new Queue( );

            try
            {
                for( int i = 0; i < 10; i++ )
                    q.enqueue( new Integer( i ) );
            }
            catch( Exception ex ) {
                System.out.println( "Unexpected overflow" );
            }

            while( !q.isEmpty( ) )
                System.out.println( q.dequeue( ) );
        }    
    }