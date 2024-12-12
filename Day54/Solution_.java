package Day54;

class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> startingCities = new ArrayList<>();
        for (List<String> path : paths) 
        {
            startingCities.add(path.get(0));
        }

        for (List<String> path : paths) 
        {
            if (!startingCities.contains(path.get(1))) 
            {
                return path.get(1);
            }
        }

        return ""; 
    }
}

