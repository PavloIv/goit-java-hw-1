package exercise;

public class GooSearchResult {
    private String url;
    public GooSearchResult(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    public String parseDomain(){
        String temp = "";
        String result = "";
        int index = 0;
        if (getUrl().startsWith("https://")) {
            temp = getUrl().replace("https://", "");
        }else
        {temp = getUrl().replace("http://", "");}
        String[] isbnParts = temp.split("/");
        return isbnParts[0];
    }
}

