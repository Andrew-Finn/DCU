import sys


def light_status(time, red_duration, green_duration):
    t = 0
    status = "Red"
    stop = False
    while t < time and not stop:
        if status == "Red" and t + red_duration <= time:
            status = "Green"
            t += red_duration
        elif status == "Green" and t + green_duration <= time:
            status = "Red"
            t += green_duration
        else:
            stop = True
    if status == "Red":
        return red_duration - (time - t)
    else:
        return 0


def main():
    f = sys.stdin.readlines()
    road_length = int(f[0])
    light_dic = {}
    for line in f[1:]:
        line = line.strip().split()
        light_dic[int(line[0])] = line[1:]
    distance_traveled = 1
    time = 1
    while distance_traveled < road_length:
        try:
            light_list = light_dic[distance_traveled]
            [red_duration, green_duration] = light_list
            time += light_status(time, int(red_duration), int(green_duration)) + 1
        except KeyError:
            time += 1
        distance_traveled += 1
    print(time)


if __name__ == '__main__':
    main()
