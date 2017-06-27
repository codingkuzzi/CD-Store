class CDStore {
  public String mName;
  public String mAlbumName;
  public int mReleaseYear;
  public int mPrice;

  public CDStore(String name, String albumName, int releaseYear, int price){
    mName = name;
    mAlbumName = albumName;
    mReleaseYear = releaseYear;
    mPrice = price;
  }

  public boolean compareYear(int inputYear){
    return(mReleaseYear == inputYear);
  }

  public boolean withinBudget(int budget){
    return(mPrice <= budget);
  }

  public boolean compareArtist(String inputName){
    return(inputName.equals(mName));
  }

}
