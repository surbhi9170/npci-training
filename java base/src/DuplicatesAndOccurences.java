import java.util.*;
public class DuplicatesAndOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split("\\s*,\\s*");
        int[] arr = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++)
        {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        System.out.print("\nStep 1:");

        Boolean[] checked= new Boolean[arr.length];
        for (int i = 0; i < checked.length; i++)
        {
           checked[i]=false;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!checked[i]) {
                System.out.print("[");
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        checked[j]=true;
                    }
                }
                System.out.print("]");
            }
        }

        //step 2:

        System.out.print("\nStep 2:");
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < checked.length; i++)
        {
            checked[i]=false;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!checked[i]) {
                System.out.print("[");
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        checked[j]=true;
                    }
                }
                System.out.print("]");
            }
        }

        //step 3:
        System.out.print("\nStep 3:");
        int[] iteration=new int[arr.length];
        for (int i = 0; i < checked.length; i++)
        {
            checked[i]=false;
        }
        for (int i = 0; i < checked.length; i++)
        {
            iteration[i]=0;
        }
        int c=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            c=0;
            if(!checked[i]) {
                //System.out.print("[");
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        c++;
                        //System.out.print(arr[i] + " ");
                        checked[j]=true;
                    }
                }
                iteration[i]=c;
                //System.out.print("]");
            }
            if (c>max)
            {
                max=c;
            }
        }


        while(max!=0)
        {
            for(int i=0;i<arr.length;i++) {
                if(iteration[i]==max)
                {
                    System.out.print("[");
                    for(int k=0;k <iteration[i];k++ )
                        System.out.print(arr[i]+" ");
                    System.out.print("]");
                    iteration[i]=0;
                }
            }
            max=0;
            for(int k=0;k <iteration.length;k++ )
            {
                if (iteration[k]>max)
                {
                    max=iteration[k];
                }
            }
        }

    }
}

