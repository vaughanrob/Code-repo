package house
/**
 * Created by gtohill on 16/02/17.
 */
class Person {

    String  firstName
    String  lastName
    String  subId
    String  email
    List<Post> posts
    String financeScore = 100
    String taskScore

    static hasMany = [posts : Post]

    static constraints = {
        subId size: 2..50, unique: true
        posts nullable: true
        //email email: true, blank:false
        taskScore nullable: true
    }

}
