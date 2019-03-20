package com.gaisinkv.testdome.Path;

//40min
public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {
        String[] newP = newPath.split("/");
        String[] oldP = path.split("/");
        int lineCount=0;
        for(String s:newP){
            if(s.equals("..")){
                lineCount++;
            }
        }

        int len = oldP.length;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len-lineCount; i++){
            sb.append(oldP[i]).append("/");
        }

        len = newP.length;
        for(int i = 0; i < len; i++){
            if(!newP[i].equals("..")){
                sb.append(newP[i]).append("/");
            }
        }
        path = sb.substring(0, sb.length()-1);
        if(!path.contains("/"))
            throw new UnsupportedOperationException("Directory not found");
    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("../x");
        System.out.println(path.getPath());
    }
}
