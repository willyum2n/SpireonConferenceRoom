package spireonconferenceroom

class Location {

	String name
	String city
	String state
	String color		// Is there a color datatype?

    static constraints = {
    	name(maxSize:45)
    	city(maxSize:45)
    	state(maxSize:45)
    	color(maxSize:45)
    }

    static hasMany = [ rooms : Room ]
}
