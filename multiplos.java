public static void multiplos(int numeroMax) {
    
    for (int i=0;i<=numeroMax;i++) {
        if(i%49==0) {
            System.out.println("Múltiplo de 49: "+i);
        }
        else if(i%100==0) {
            System.out.println("Múltiplo de 100: "+i);
        }
    }
}