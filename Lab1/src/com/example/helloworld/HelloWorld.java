package com.example.helloworld;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
    //Compulsory
    System.out.println("Hello World!");
    String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"} ;
    int n = (int) (Math.random() * 1_000_000);
    System.out.println(n);
    int result = n * 3 ;
    result = result + 0b10101 ;
    result = result + 0xFF ;
    result = result * 6 ;
    System.out.println(result);
    int s = 0;
    while(result > 9){
        while(result != 0){
            s = s + result % 10 ;
            result = result / 10 ;
        }
        result = s ;
        s = 0 ;
    }
    System.out.println(result);
    System.out.println("Willy-nilly, this semester I will learn " + languages[result]) ;

    //Homework
        long t0= System.nanoTime();

        HelloWorld app = new HelloWorld();

        //1
        if (args.length < 3) {
            System.out.println("Not enough arguments!");
            System.exit(-1);
        }
        int m = Integer.parseInt(args[0]);
        int p = Integer.parseInt(args[1]);

        char[] litere= new char[52];
        int i =2;
        while(args.length >i){
            char lit = args[i].charAt(0);
            if(lit>='a'&&lit<='z' || lit>='A'&&lit<='Z'){
                litere[i-2]=lit;
                i++;
            }

            else {
                System.out.println("Argument gresit!");
                System.exit(-1);
            }

        }
        //2
        String words[] = app.generate( m,p,i-2, litere);

        //3
        int[][] adjacency = new int[m][m];
        String[][] neighbors = new String[m][m];
        for(i=0;i<m;i++){
            for(int j=0;j<m && i!=j ;j++){
                for(int k=0;k<p;k++){
                    char c=words[i].charAt(k);
                    if(words[j].indexOf(c)!=-1) {
                        adjacency[i][j] = 1;
                        adjacency[j][i] = 1;

                    }
                }
            }

        }
        for(i=0;i<m;i++) {
            int nrn = 0;
            for (int j = 0; j < m; j++) {
                if (adjacency[i][j] == 1) {
                    neighbors[i][nrn] = words[j];
                    nrn++;
                }
            }

        }

        //4
        long t1=System.nanoTime();
        if(m>4000){
            System.out.println(t1-t0);
        }
        else {
            System.out.println(Arrays.toString(words));
            for (i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(adjacency[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(Arrays.deepToString(neighbors));
        }

        //Bonus
        int k=0;
        int ok=0;
        for(i=0;i<m-3 && k==0;i++)
            for(int j=m-1;j>=i+3;j--){
                if(words[i].equals(words[j])){
                    int newk=j-i;
                    for(int x=0;x<newk-1;x++){
                        if(adjacency[i+x][i+x+1]!=1){
                            ok=0;
                            break;
                        }
                        else {
                            ok=1;

                        }
                    }
                    if(ok==1 && newk>k)
                    {k=newk;
                    break;}

                }
            }
        System.out.println(k);
    }
    public String[] generate(int n,int l,int l_lit, char[] litere) {
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            while(sb.length()<l)
            {
                int pos = (int) (Math.random() * (l_lit ) ) ;
                sb.append(litere[pos]);
            }
            words[i] = sb.toString();
        }
        return words;
    }

}
