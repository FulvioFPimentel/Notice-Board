import React from "react";
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import { Text } from 'react-native'
import { Notice, Meetings, NavBar } from '../pages/index';
import { colors, theme, nav } from "../styles";

const Stack = createNativeStackNavigator();

const HeaderText: React.FC = () => <Text style={nav.leftText}>Quadro de Anúnios</Text>

const Routes: React.FC = () => {
    return (

        <Stack.Navigator screenOptions={{ 
            headerTitle: " ",
            headerStyle: {
                backgroundColor: colors.darkBlue,
            },

            headerLeft: () => <HeaderText />,
            headerRight: () => <NavBar />,
         }}>
            <Stack.Screen name="Notice" component={Notice} />
            <Stack.Screen name="Meetings" component={Meetings} />
        </Stack.Navigator>

    );
}

export default Routes;