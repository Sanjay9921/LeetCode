public class Codec {
    
    Map<String, String> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        double randX = Math.random()*100; //ASCII to HEX concept, random generates 0.xx -> so x100 -> xx
        randX = Math.floor(randX);//if xx generated is 55.59 but no ascii exists for decimals
        sb.append((char)randX);
        
        while(map.containsKey(sb.toString())){
            double recheckRandX = Math.random()*100;
            recheckRandX = Math.floor(recheckRandX);
            sb.append((char)recheckRandX);
        }
        
        map.put(sb.toString(), longUrl);
        
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));