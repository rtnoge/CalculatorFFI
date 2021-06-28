//
//  calculate.h
//  Test
//
//  Created by Enoge on 01/07/20.
//  Copyright © 2020 Enoge. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Calculate : NSObject
+(int)plus:(int)input1 secondInput:(int)input2;
+(int)minus:(int)input1 secondInput:(int)input2;
+(int)multiple:(int)input1 secondInput:(int)input2;
+(float)divide:(int)input1 secondInput:(int)input2;
@end

