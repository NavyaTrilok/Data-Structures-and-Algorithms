class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> map = new HashMap<>();
        List<String> res = new ArrayList<>();

        // Build name -> list of minutes
        for (int i = 0; i < keyName.length; i++) {
            String k = keyName[i];

            // Option 2: explicit if
            if (!map.containsKey(k)) {
                map.put(k, new ArrayList<>());
            }
            map.get(k).add(getTime(keyTime[i]));
        }

        // For each person, sort times and check any 3 within 60 minutes
        for (String k : map.keySet()) {
            List<Integer> times = map.get(k);
            Collections.sort(times);
            for (int i = 2; i < times.size(); i++) {
                if (times.get(i) - times.get(i - 2) <= 60) {
                    res.add(k);
                    break;
                }
            }
        }

        Collections.sort(res);
        return res;
    }

    private int getTime(String s) {
        String[] p = s.split(":");
        return Integer.parseInt(p[0]) * 60 + Integer.parseInt(p[1]);
    }
}
