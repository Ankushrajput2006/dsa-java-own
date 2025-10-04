//package String;

public class sb {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        builder.reverse();

        System.out.println(builder);
}
}


/*append()	Adds text at the end
insert()	Inserts text at a specific index
replace()	Replaces part of the text
delete()	Deletes part of the text
reverse()	Reverses the entire string
toString()	Converts StringBuilder to String */