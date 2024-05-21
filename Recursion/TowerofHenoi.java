public class TowerofHenoi {
    public static void towerofhenoi(int n,String src,String help , String dest) {
        if(n==1){
            System.out.println("Transfer Disk"+  " " + n + " " +"from"+ " " + src +  " " + "to"+ " "+ dest);
            return;
        }

        towerofhenoi(n-1, src, dest, help);
        System.out.println("Transfer Disk"  +  " " + n + " " + "from"+  src + " "  + "to"+  " " + dest); 
        towerofhenoi(n-1, help, src, dest);
    }
    public static void main(String args[]) {
       int n = 3;
       towerofhenoi(n, "S", "H", "D");
        
    }
}
