public class Main {
    void createFile(String fileName){
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
 
    bool authennticate(String psw){
        if(psw.equals("1234")){
            return true;
        }
        return false;
    }
 
    String buildSQL(String name) {
        name = request.getParameter("name");
        return "SELECT * FROM " + name;
    }  
} 