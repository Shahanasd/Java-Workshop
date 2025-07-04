package src.com.vetias.java.workshop.tempdata.beans;

public class Academicbuilding extends Building {
    private boolean isLibraryAvailable;
    private boolean isAuditoriumAvailable;

    public boolean isLibraryAvailable() {
        return isLibraryAvailable;
    }
    public void setLibraryAvailable(boolean isLibraryAvailable) {
        this.isLibraryAvailable = isLibraryAvailable;
    }  
    public boolean isAuditoriumAvailable(){
        return isAuditoriumAvailable;
    }
    public void setAuditoriumAvailable(boolean isAuditoriumAvailable){
        this.isAuditoriumAvailable = isAuditoriumAvailable;
    }
}
