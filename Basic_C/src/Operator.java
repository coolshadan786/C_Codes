
public class Operator {

	public static void main(String[] args) {
        int a,b,c;
        b=10;
        a=b=c=20;
        System.out.println(a);

        System.out.println(0x10+" "+ 10 + " " + 010 + " " + 0b10);

        System.out.println(4 + 1.0f);

        System.out.println("1"+2+3);

        System.out.println(1+2+"3");

        int k=1;
        int i=++k + k++ + + k;
        System.out.println(i);

        byte z=(byte) 128;
        int x=z;
        System.out.println(x);



	}

}
