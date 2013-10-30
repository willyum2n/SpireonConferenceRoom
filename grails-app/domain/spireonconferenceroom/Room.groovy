package spireonconferenceroom

class Room {

	String name
	String size
	byte[] photo
	String features

    static constraints = {
    	name(maxSize:45)
    	size(maxSize:45)
    	photo(nullable:true)
    	features(maxSize:45)
    }

	static belongsTo = [ location : Location ]
	static hasMany = [ reservations : Reservation ]
}
