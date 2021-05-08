package teacher



class Teacher(val name:String,
              val surName:String,
              val age:Int,
              val stage:Double,
              val _class:String) {

    override fun equals(other: Any?): Boolean {

        if (this === other) return true
        if (other !is Teacher) return false

        other as Teacher

        if (name != other.name) return false
        if (surName != other.surName) return false
        if (age != other.age) return false
        if (stage != other.stage) return false
        if (_class != other._class) return false

        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1

        result = prime * result + (name?.hashCode() ?: 0)
        result = prime * result + (age?.hashCode())
        result = prime * result + (surName?.hashCode())
        result = prime * result + (_class?.hashCode())
        result = prime * result + if (stage?.equals(null)) 0 else stage.hashCode()

        return result

    }

    override fun toString(): String {

        return "$name, $surName, $age, $stage, $_class"
    }
}