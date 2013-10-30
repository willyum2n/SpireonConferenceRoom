package spireonconferenceroom

class Reservation {


	Room room
	Date startTime
	Date endTime
	Date dateCreated = new Date()

    static constraints = {
    	room(nullable:false)
    	startTime(nullable:false)
    	endTime(nullable:false)
    	dateCreated(nullable:false)
    }

    static mapping = {
    }

    static belongsTo = [ room : Room ]
}
