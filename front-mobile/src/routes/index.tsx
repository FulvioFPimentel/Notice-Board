import React from "react";
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import { Notice, Home } from '../pages/index';



const Stack = createNativeStackNavigator();

const Routes: React.FC = () => {
    return (

        <Stack.Navigator>
            <Stack.Screen 
                options={{ headerShown: false }}
            name="Home" component={Home} />
            <Stack.Screen name="Notice" component={Notice} />
        </Stack.Navigator>

    );
}

export default Routes;