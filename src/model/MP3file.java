package model;

public class MP3file {//implements Comparable<MP3file>{
    private String name;
    private String path;

    public MP3file(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

//    @Override
//    public int compareTo(MP3file o) {
//        return o.name.compareTo(name);
//    }
}
