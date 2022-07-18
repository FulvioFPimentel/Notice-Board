import React, { useState } from "react";
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import { Text } from 'react-native'
import { Notice, Meetings, NavBar } from '../pages';
import { colors, nav } from "../styles";

const Stack = createNativeStackNavigator();

const Routes: React.FC = () => {

    const [title, setTitle] = useState("Quadro de anuncio");

    const HeaderText: React.FC = () => <Text style={nav.leftText}>{title}</Text>

    return (
        <Stack.Navigator screenOptions={{ 
            headerTitle: " ",
            headerStyle: {
                backgroundColor: colors.darkBlue, 
            },
            
            headerLeft: () => <HeaderText />,
            headerRight: () => <NavBar screen={setTitle}/>,
            }}>

            <Stack.Screen name="Notice" component={Notice} />
            <Stack.Screen name="Meetings" component={Meetings} />
        </Stack.Navigator>
    );
}

export default Routes;