//
//  calculate.m
//  Test
//
//  Created by Enoge on 01/07/20.
//  Copyright © 2020 Enoge. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "calculate.h"

@implementation Calculate
+(int)plus:(int)input1 secondInput:(int)input2{
    int result;
    result = input1+input2;
    return result;
}

+(int)minus:(int)input1 secondInput:(int)input2{
    int result;
    result = input1-input2;
    return result;
}

+(int)multiple:(int)input1 secondInput:(int)input2{
    int result;
    result = input1*input2;
    return result;
}

+(float)divide:(int)input1 secondInput:(int)input2{
    float result;
    result = input1/input2;
    return result;
}
@end
