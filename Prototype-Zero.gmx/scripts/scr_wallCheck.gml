var inst;
if (place_meeting(x+1,y,obj_wall)) {
    inst = instance_position(x+1,y,obj_wall)
    if (inst != noone) {
        if (inst.ableToGrab = true) {
            ledgeToGrab = true 
            wallWorkingWith = inst
        }
    }
}
if (place_meeting(x-1,y,obj_wall)) {
    inst = instance_position(x-1,y,obj_wall)
    if (inst != noone) {
        if (inst.ableToGrab) {
            return game_end()
        }
    }
}
