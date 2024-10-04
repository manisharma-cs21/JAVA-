import java.util.*;
public class ImpHashing {
    static class Hashmap<K,V>{  //Generics
        private class Node{
            K key ;
            V value;
            public Node(K key, V value)
            {
                this.key =key;
                this.value=value;
            }


        }
        private int n;  //Number of nodes
        private int N ; //Number of buckets
        private LinkedList<Node> buckets[]; 

        @SuppressWarnings("unchecked")
        public Hashmap(){
           this.N=4;
           this.buckets=new LinkedList[4];
           for(int i=0;i<4;i++)
           {
            this.buckets[i]=new LinkedList<>();
           }
        }
        private int Hashfun(K key)
        {
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }
        private int SearchInLL(K key ,int bi)
        {
            LinkedList<Node> ll =new buckets[bi];
            for(int i=0;i<ll.size();i++)
            {
                if(ll.get[i].key==key)
                return i;
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldbuckets[]=  buckets;
            buckets =new LinkedList[N*2];
            for(int i=0;i<N*2;i++)
            {
                buckets[i]=new LinkedList<>(null);
            }

            for(int i=0;i<oldbuckets.length;i++)
            {
                LinkedList<Node> ll=oldbuckets[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }

        }


        public void put(K key, V value)
        { 
            int bi = Hashfun(key);     // To find the bucket index; 
            int di = SearchInLL(key , bi) ;//di==1 or -1

            if(di==-1) // if key does not exist 
            {
                buckets[bi].add(new Node(key,value)); // add the key in bucket's bi index and increase the node;
                n++;

            }
            else{
                Node node = buckets[bi].get(di);  //get the key and change the value 
                node.value=value;
            }
            double lambda= (double)n/N;
            if(lambda>2.0)
            {
                //rehashing
                rehash();
            }
        }

    }
    public static void main(String[] args) {
        HashMap<String ,Integer> map=new HashMap<>(0, 0) ;
        map.put("India",120);
    }
     
    
}
