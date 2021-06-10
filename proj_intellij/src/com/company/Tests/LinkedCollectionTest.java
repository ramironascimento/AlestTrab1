package com.company.Tests;

import com.company.LinkedCollection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedCollectionTest extends LinkedCollection<String>{

    @Test
    void newNodePosition() {
        LinkedCollectionTest list_words = new LinkedCollectionTest();

        list_words.addFirst("abacaxi");
        list_words.addLast("acetona");
        list_words.addLast("barba");
        list_words.addLast("cavalo");
        list_words.addLast("domino");

        assertEquals(0,list_words.newNodePosition("aabacaxi"));
        assertEquals(1,list_words.newNodePosition("abbacaxi"));
        assertEquals(2,list_words.newNodePosition("adetona"));
        assertEquals(3,list_words.newNodePosition("caavalo"));
        assertEquals(5,list_words.newNodePosition("garagem"));

        list_words.add(list_words.newNodePosition("caavalo"),"caavalo");
        assertEquals(list_words.get(3),"caavalo");
        assertEquals(list_words.get(4),"cavalo");
    }

    @Test
    void exist_word() {
        LinkedCollectionTest list_words = new LinkedCollectionTest();
        list_words.addFirst("abacaxi");
        list_words.addLast("acetona");
        list_words.addLast("barba");
        list_words.addLast("cavalo");
        list_words.addLast("domino");

        assertTrue(list_words.existWord("domino"));
        assertTrue(list_words.existWord("DOMINO"));
        assertTrue(list_words.existWord("barba"));
        assertFalse(list_words.existWord("DOMINÓ"));
        assertFalse(list_words.existWord("ABCD"));

    }

    @Test
    void addFirst() {
        LinkedCollectionTest list_words = new LinkedCollectionTest();

        //add when is empty
        list_words.addFirst("first_word");
        assertEquals("first_word", list_words.get(0));
        assertEquals(list_words.getTail(),list_words.get(0));
        assertEquals(list_words.getHead(),list_words.get(0));

        //add when already have a node in tail
        list_words.addFirst("second_word");
        assertEquals("second_word", list_words.get(0));
        assertEquals(list_words.getTail(),list_words.get(0));
        assertEquals(list_words.getHead(),list_words.get(1));


    }

    @Test
    void get() {
        LinkedCollectionTest list_words = new LinkedCollectionTest();
        list_words.add(0,"1st element"); // add as first
        list_words.add(0,"2nd element"); // add at tail's place
        list_words.addFirst("tail element"); // add at tail's place

        assertEquals("tail element",list_words.get(0));
        assertEquals("2nd element",list_words.get(1));
        assertEquals("1st element",list_words.get(2));

        assertEquals(list_words.getHead(),list_words.get(2));
        assertEquals(list_words.getTail(),list_words.get(0));
    }

    @Test
    void addLast() {
        LinkedCollectionTest list_words = new LinkedCollectionTest();
        list_words.add(0,"1st element");
        list_words.addLast("last item");
        assertEquals(list_words.getHead(),list_words.get(1),"Added element should be Head");
        list_words.addLast("new head");
        assertNotEquals(list_words.getHead(),list_words.get(1),"After added a new last Node, the previous one should not be Head anymore");
        assertEquals(list_words.getHead(),list_words.get(2),"Last element added should be Head");
        list_words.add(2,"newest of all heads");
        assertNotEquals(list_words.getHead(),list_words.get(2));
        assertEquals(list_words.getHead(),list_words.get(3));
    }

    @Test
    void add() {
        LinkedCollectionTest list_words = new LinkedCollectionTest();
        list_words.addFirst("first_word");

        //added as first
        list_words.add(0,"added_item");
        assertEquals("added_item",list_words.get(0));

        //added between an occupant and a previous one
        list_words.add(1,"second_added_item");
        assertEquals("second_added_item",list_words.get(1));

    }

    @Test
    void remove() {
        LinkedCollectionTest list_words = new LinkedCollectionTest();
        list_words.addFirst("first_word");

        String remove_only_node = list_words.remove(0);
        assertEquals(remove_only_node,"first_word","Should return the Node Item");
        assertNull(list_words.getHead(),"After removing the only node, Head should be empty");
        assertNull(list_words.getTail(),"After removing the only node, Tail should be empty");

        //added as first
        list_words.addFirst("first_word");
        list_words.addLast("added_item");

        assertEquals(list_words.getHead(),"added_item");
        String removed_node = list_words.remove(1);
        assertEquals(removed_node,"added_item", "Should return the Node Item");
        assertEquals(list_words.getHead(),"first_word");

    }

    @Test
    void existPage() {
        LinkedCollectionTest list_words = new LinkedCollectionTest();

        list_words.addFirst("abacaxi");
        list_words.addLast("acetona");
        list_words.addPage("abacaxi",1);
        list_words.addPage("abacaxi",1);
        list_words.addPage("abacaxi",2);

        assertEquals(list_words.getWord("abacaxi").getPages().get(0),1);
        assertEquals(list_words.getWord("abacaxi").getPages().get(1),2);
    }
}