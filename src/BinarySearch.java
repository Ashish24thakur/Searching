import java.util.Scanner;

public class BinarySearch {

    public static void BinarySearch(int arr[],int ele) {
        int f = 0;
        int c = 0;
        int l = arr.length - 1;

        while (f<arr.length && f <= l) {
            int mid = (f + l) / 2;
            if (arr[mid] == ele) {
                c = 1;
                System.out.println(ele + " found at index " + mid);
                break;
            } else if (arr[mid] < ele) {
                f = mid + 1;
            } else if (arr[mid] > ele) {
                l = mid - 1;
            }
        }
        if (c == 0) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        BinarySearch(arr,ele);
    }
}

 // In C++...............................


 #include <iostream>

 using namespace std;
 void Search(int arr[],int n,int ele)
 {
     int f=0;
     int l=n-1;
     int c=0;
     while(f<n && f<=l)
     {
         int med = (f+l)/2;
         if(arr[med]==ele)
         {
             c=1;
             cout << ele << " found at index " <<med;
             break;
         }
         else if(arr[med]<ele)
         {
             f = med+1;
         }
         else if(arr[med]>ele)
         {
             l=med-1;
         }
     }
     if(c==0)
     {
         cout<<"Element not found";
     }

 }
 int main()
 {
     int n;
     cin>>n;
     int arr[n];
     for (int i = 0; i < n; i++) {
         cin>>arr[i];
     }
     int ele;
     cin>>ele;
     Search(arr,n,ele);    

     return 0;
 }

  // In C............................


 #include <stdio.h>

 void Search(int arr[],int n,int ele)
 {
     int f=0;
     int l=n-1;
     int c=0;
     while(f<n && f<=l)
     {
         int med = (f+l)/2;
         if(arr[med]==ele)
         {
             c=1;
             printf("%d  found at index %d",ele,med);
             break;
         }
         else if(arr[med]<ele)
         {
             f = med+1;
         }
         else if(arr[med]>ele)
         {
             l=med-1;
         }
     }
     if(c==0)
     {
         printf("Element not found");
     }

 }
 int main()
 {
     int n;
     scanf("%d",&n);
     int arr[n];
     for (int i = 0; i < n; i++) {
         scanf("%d",&arr[i]);
     }
     int ele;
     scanf("%d",&ele);
     Search(arr,n,ele);

     return 0;
 }
