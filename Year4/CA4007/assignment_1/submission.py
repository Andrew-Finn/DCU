import numpy as np
from matplotlib import pyplot as plt


def camera_projection(points, focal_length, c, v, r):
    fl = focal_length

    # Create Intrinsic matrix
    intrinsic_matrix = np.array([[fl, 0, c[0], 0],
                                 [0, fl, c[1], 0],
                                 [0, 0, 1, 0]])

    # Create Rotational matrix (In our case this will be the identity matrix as we don't preform any rotation)
    c1, s1 = np.cos(np.radians(r[0])), np.sin(np.radians(r[0]))
    c2, s2 = np.cos(np.radians(r[1])), np.sin(np.radians(r[1]))
    c3, s3 = np.cos(np.radians(r[2])), np.sin(np.radians(r[2]))

    rm = np.array([[1, 0, 0],
                   [0, c1, -s1],
                   [0, s1, c1]]).dot(
        np.array([[c2, 0, s2],
                  [0, 1, 0],
                  [-s2, 0, c2]])).dot(
        np.array([[c3, -s3, 0],
                  [s3, c3, 0],
                  [0, 0, 1]]))

    # Using Rotational matrix create Extrinsic Matrix
    extrinsic_matrix = np.array([[rm[0][0], rm[0][1], rm[0][2], v[0]],
                                 [rm[1][0], rm[1][1], rm[1][2], v[1]],
                                 [rm[2][0], rm[2][1], rm[2][2], v[2]],
                                 [0, 0, 0, 1]])

    m = intrinsic_matrix.dot(extrinsic_matrix)
    points = np.vstack((np.transpose(points), np.array(np.ones(points.shape[0]))))
    p2d = np.dot(m, points)

    for i in range(2):
        p2d[i] /= p2d[2]
    return p2d


def main():
    teapot = np.load("teapot.npy")
    ax = plt.axes(projection="3d")
    ax.plot(teapot[:, 0], teapot[:, 1], teapot[:, 2], "r.")
    ax.set_xlabel("X Axis")
    ax.set_ylabel("Y Axis")
    ax.set_ylabel("Z Axis")
    plt.title("Figure 0: 3D Projection of 'teapot' with no manipulation")
    plt.show()

    # Objective 1: Projection with principle at [0, 0]
    obj1 = camera_projection(points=teapot, focal_length=1000, c=[0, 0], v=[0, 0, 10], r=[0, 0, 0])
    ax = plt.axes()
    ax.plot(obj1[0], obj1[1], "r.")
    ax.set_xlabel("X Axis")
    ax.set_ylabel("Y Axis")
    plt.title("Figure 1: Projection with principle at [0, 0]")
    plt.axis([0, max(obj1[0]), 0, max(obj1[1])])
    plt.show()

    # Objective 2: Figure 2: Projection with image resolution=1920 × 1080
    obj2 = camera_projection(points=teapot, focal_length=1000, c=[1920 // 2, 1080 // 2], v=[0, 0, 10], r=[0, 0, 0])
    ax = plt.axes()
    ax.plot(obj2[0], obj2[1], "r.")
    ax.set_xlabel("X Axis")
    ax.set_ylabel("Y Axis")
    plt.title("Figure 2: Projection with image resolution=1920 × 1080")
    plt.axis([0, 1920, 0, 1080])
    plt.show()


if __name__ == '__main__':
    main()
