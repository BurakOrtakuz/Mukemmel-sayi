public class Main {

    public static void main(String[] args) {
	int sayı = 29;
	int[] depo = new int[sayı];
	int toplam=0;
	for(int a=1; a<=sayı/2;a++){

	    if (sayı %a ==0){
	        toplam= toplam +a;
        }
    }
	if(toplam == sayı){
	    System.out.println("Mükemmel sayı!");
    }else{
	    System.out.println("Mükemmel sayı değil!");
    }
    }
}
