public class Q10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> deck = new ArrayDeque<Integer>();
        int n = Integer.parseInt(br.readLine());
        List<Integer> ls = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
           String [] prom = br.readLine().split(" ");
           
           switch(prom[0]) {
              case "push_front": {
                 deck.addFirst(Integer.parseInt(prom[1]));
                 break;
              }
              
              case "push_back": {
                 deck.addLast(Integer.parseInt(prom[1]));
                 break;
              }
     
              case "pop_front": {
                 if (deck.isEmpty()) 
                    ls.add(-1);
                 else 
                    ls.add(deck.pollFirst());
                 
                 break;
              }
     
              case "pop_back": {
                 if (deck.isEmpty()) 
                    ls.add(-1);
                 else 
                    ls.add(deck.pollLast());
                 break;
              }
     
              case "size": {
                 ls.add(deck.size());
                 break;
              }
     
              case "empty": {
                 if (deck.isEmpty())
                    ls.add(1);
                 else
                    ls.add(0);
                 break;
              }
     
              case "front": {
                 if (deck.isEmpty()) 
                    ls.add(-1);
                 else 
                    ls.add(deck.peekFirst());
                 break;
              }
     
              case "back": {
                 if (deck.isEmpty()) 
                    ls.add(-1);
                 else 
                    ls.add(deck.peekLast());
                 break;
              }
           }
        }
        for(Integer i : ls)
           System.out.println(i);
     }
  
}
