package com.lalsoft.dagger2learning.car

import javax.inject.Inject

private const val TAG = "Car"

class Wheels @Inject constructor(rims: Rims, tires: Tires)