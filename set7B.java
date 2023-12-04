
/**
 * Write a description of class set7B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class set7B
{
   public void Eratosthenes(int n) {
       ArrayList<Integer> lst = new ArrayList();
       for(int i = 2; i < n; i++) {
           lst.add(i);
       }
       for(int x = 2; x < n; x++) {
           for(int y = lst.size() - 1; y > 2; y--) {
               if(lst.get(y) % x == 0 && x != lst.get(y))
               lst.remove(y);
           }
       }
       lst.remove(lst.indexOf(4));
       System.out.println(lst);
       GoldBach(n, lst);
   }
   public void GoldBach(int n, ArrayList<Integer> lst) {
     for(int i = 0; i < lst.size(); i++) {
         for(int x = lst.size() - 1; x >= i; x--) {
             if(lst.get(x) + lst.get(i) == n) {
                 System.out.println(lst.get(x) + " + " + lst.get(i) + " = " + n);
                 break;
             }
         }
     }
     
   }
}
