
// In java

import java.util.Scanner;
public class Linear_Search {
 public static void Search(int arr[],int ele)
 {
     // here f will work as a counter.
     int f=0;
     for (int i = 0; i < arr.length; i++) {
         if(arr[i] == ele)
         {
             f=1;
             System.out.println(ele + " is present at "+ i + " index");
         }
     }
     if(f==0)
     {
         System.out.println("Element not found.......");
     }
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // array declaration with n size.
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            //  array element input one by one.
            arr[i] = sc.nextInt();
        }

        // input element which we want to search.
        int ele = sc.nextInt();

        // method calling without creating object because we have used static keyword.
        Search(arr,ele);

    }
}

// In c


#include <stdio.h>

        void Search(int arr[],int n,int ele)
            {
                int f=0;
                for(int i=0;i<n;i++)
                {
                    if(arr[i]==ele)
                    {
                        f=1;
                        printf("%d is present at %d index",ele,i+1);
                    }
                }
                if(f==0)
                {
                    printf("Element not found");
                }
            }
        int main()
        {
            int n;
            scanf("%d",&n);
            int arr[n];
            for(int i=0;i<n;i++)
            {
                scanf("%d",&arr[i]);
            }
            int ele;
            scanf("%d",&ele);
            Search(arr,n,ele);

            return 0;
        }

//    In C++ .....................................................

#include <iostream>

using namespace std;
        void Search(int arr[],int n,int ele)
        {
            int f=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==ele)
                {
                    f=1;
                    cout<<ele << " is present at index " << i;
                }
            }
            if(f==0)
            {
                cout<<"element not found";
            }
            }
        int main()
        {
            int n;
            cin>>n;
            int arr[n];
            for (int i = 0; i < n; i++)
            {
                cin>>arr[i];
            }
            int ele;
            cin>>ele;
            Search(arr,n,ele);

        return 0;
        }



