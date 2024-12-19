
package model;

public class GradeModel {
   
    /**
     * @return the science
     */
     public String getIdNumber() {
        return idnumber;
    }

    /**
     * @param science the science to set
     */
    public void setIdNumber(String idnumber) {
        this.idnumber = idnumber;
    }
    
    public String getScience() {
        return science;
    }

    /**
     * @param science the science to set
     */
    public void setScience(String science) {
        this.science = science;
    }

    /**
     * @return the english
     */
    public String getEnglish() {
        return english;
    }

    /**
     * @param english the english to set
     */
    public void setEnglish(String english) {
        this.english = english;
    }

    /**
     * @return the math
     */
    public String getMath() {
        return math;
    }

    /**
     * @param math the math to set
     */
    public void setMath(String math) {
        this.math = math;
    }

    /**
     * @return the filipino
     */
    public String getFilipino() {
        return filipino;
    }

    /**
     * @param filipino the filipino to set
     */
    public void setFilipino(String filipino) {
        this.filipino = filipino;
    }
    
      public GradeModel( String idnumber, String science, String english, String math, String filipino) {
        this.idnumber = idnumber;
        this.science = science;
        this.english = english;
        this.math = math;
        this.filipino = filipino;
      
    }
      
      public GradeModel (){
          
      }
    
    private String idnumber;
    private String science;
    private String english;
    private String math;
    private String filipino;
}
