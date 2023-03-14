package world.ntdi.cachedemo;

import org.checkerframework.checker.units.qual.K;
import world.ntdi.cachedemo.cache.Cache;
import world.ntdi.cachedemo.cache.CacheItem;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CacheDemo {
    public static void main(String[] args) {
        Cache<Integer, Character> cache = new Cache<>(5);

        cache.put(1, '5');
        cache.put(2, '2');
        cache.put(3, '3');
        cache.put(4, '4');
        cache.put(5, '1');

        printMap(cache.getMap());

        cache.get(4);
        cache.get(4);

        cache.get(5);
        cache.get(5);
        cache.get(5);

        cache.get(3);
        cache.get(3);
        cache.get(3);

        cache.get(1);
        cache.get(1);
        cache.get(1);

        cache.put(6, 'b');

        printMap(cache.getMap());

        cache.get(6);
        cache.get(6);
        cache.get(6);

        cache.put(7, 'k');

        printMap(cache.getMap());
    }

    public static void printMap(Map<Integer, CacheItem> map) {
        System.out.println("---print load---");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getKey());
        }
    }
}
