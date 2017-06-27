import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    CDStore cd1 = new CDStore("Pink", "The Truth About Love", 2012, 10);
    CDStore cd2 = new CDStore("Local Natives", "Sunlit Youth", 2016, 12);
    CDStore cd3 = new CDStore("Red Hot Chili Peppers", "The Getaway", 2016, 13);
    CDStore cd4 = new CDStore("Tame Impala", "Currents", 2015, 9);
    List<CDStore> cdList = new ArrayList<CDStore>();
    cdList.add(cd1);
    cdList.add(cd2);
    cdList.add(cd3);
    cdList.add(cd4);

    System.out.println("Welcome to our CD Store!");
    System.out.println("You can search CDs by release year, price range or artist.");
    System.out.println("You can donate your own CD too.");
    System.out.println("You can view all our CDs.");

  //  int proceed;
    int answer = 1;
    while (answer != 6) {
      System.out.println("Press 1 to see all of our CDs. Press 2 to search CDs by release year. Press 3 to search CDs by price range. Press 4 to search CDs by artist. Press 5 to add your CD. Press 6 to quit.");
      String userAnswer = myConsole.readLine();
      answer = Integer.parseInt(userAnswer);
      if(answer == 1) {
        for(CDStore eachCD : cdList) {
          System.out.println("------------------");
          System.out.println(eachCD.mName);
          System.out.println(eachCD.mAlbumName);
          System.out.println(eachCD.mReleaseYear);
          System.out.println(eachCD.mPrice);
        }
      }
      else if(answer == 2) {
        System.out.println("Put a year.");
        int inputYear = Integer.parseInt(myConsole.readLine());
        int yearCount = 0;
        for(CDStore eachCD : cdList) {
          if(eachCD.compareYear(inputYear)) {
            System.out.println("------------------");
            System.out.println(eachCD.mName);
            System.out.println(eachCD.mAlbumName);
            System.out.println(eachCD.mReleaseYear);
            System.out.println(eachCD.mPrice);
            yearCount++;
          }

        }
        if (yearCount == 0) {
          System.out.println("Thanks for visiting our CDStore!");
        }
      }
      else if(answer == 3) {
        System.out.println("Put a budget.");
        int inputBudget = Integer.parseInt(myConsole.readLine());
        int budgetCount = 0;
        for(CDStore eachCD : cdList){
          if(eachCD.withinBudget(inputBudget)){
            System.out.println("------------------");
            System.out.println(eachCD.mName);
            System.out.println(eachCD.mAlbumName);
            System.out.println(eachCD.mReleaseYear);
            System.out.println(eachCD.mPrice);
            budgetCount++;
          }
        }
        if(budgetCount == 0){
          System.out.println("You are too poor to shop at out Store!");
        }
    }
    else if(answer == 4) {
      System.out.println("Put a name.");
      String inputName = myConsole.readLine();
      int nameCount = 0;
      for(CDStore eachCD : cdList){
        if(eachCD.compareArtist(inputName)){
          System.out.println("------------------");
          System.out.println(eachCD.mName);
          System.out.println(eachCD.mAlbumName);
          System.out.println(eachCD.mReleaseYear);
          System.out.println(eachCD.mPrice);
          nameCount++;
        }
      }
      if(nameCount == 0){
        System.out.println("You can search CDs by year too!");
      }
    }
    else if(answer == 5) {
      System.out.println("Add your CD.");
      System.out.println("Put Artist's name.");
      String newArtist = myConsole.readLine();
      System.out.println("Put Album name.");
      String newAlbum = myConsole.readLine();
      System.out.println("Put year.");
      int newYear = Integer.parseInt(myConsole.readLine());
      System.out.println("Put price.");
      int newPrice = Integer.parseInt(myConsole.readLine());
      CDStore newCD = new CDStore(newArtist, newAlbum, newYear, newPrice);
      cdList.add(newCD);
      System.out.println("------------------");
      System.out.println(newCD.mName);
      System.out.println(newCD.mAlbumName);
      System.out.println(newCD.mReleaseYear);
      System.out.println(newCD.mPrice);


    }
  }
}
}
