fadeNumber = argument0

if (fadeNumber)
{
    global.fade = fadeNumber
    if (!instance_exists(obj_fade))
    {
        instance_create(0,0,obj_fade)
    }
}
else
{
    return show_debug_message('fadeNumber not set')
    game_end()
}
